package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy extends com.shahin.classroomattendance.realm.Attendance_Reports
    implements RealmObjectProxy, com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface {

    static final class Attendance_ReportsColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long dateIndex;
        long monthOnlyIndex;
        long dateOnlyIndex;
        long classIdIndex;
        long date_and_classIDIndex;
        long classnameIndex;
        long subjNameIndex;
        long attendance_students_listsIndex;

        Attendance_ReportsColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Attendance_Reports");
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.monthOnlyIndex = addColumnDetails("monthOnly", "monthOnly", objectSchemaInfo);
            this.dateOnlyIndex = addColumnDetails("dateOnly", "dateOnly", objectSchemaInfo);
            this.classIdIndex = addColumnDetails("classId", "classId", objectSchemaInfo);
            this.date_and_classIDIndex = addColumnDetails("date_and_classID", "date_and_classID", objectSchemaInfo);
            this.classnameIndex = addColumnDetails("classname", "classname", objectSchemaInfo);
            this.subjNameIndex = addColumnDetails("subjName", "subjName", objectSchemaInfo);
            this.attendance_students_listsIndex = addColumnDetails("attendance_students_lists", "attendance_students_lists", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        Attendance_ReportsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Attendance_ReportsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Attendance_ReportsColumnInfo src = (Attendance_ReportsColumnInfo) rawSrc;
            final Attendance_ReportsColumnInfo dst = (Attendance_ReportsColumnInfo) rawDst;
            dst.dateIndex = src.dateIndex;
            dst.monthOnlyIndex = src.monthOnlyIndex;
            dst.dateOnlyIndex = src.dateOnlyIndex;
            dst.classIdIndex = src.classIdIndex;
            dst.date_and_classIDIndex = src.date_and_classIDIndex;
            dst.classnameIndex = src.classnameIndex;
            dst.subjNameIndex = src.subjNameIndex;
            dst.attendance_students_listsIndex = src.attendance_students_listsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Attendance_ReportsColumnInfo columnInfo;
    private ProxyState<com.shahin.classroomattendance.realm.Attendance_Reports> proxyState;
    private RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsRealmList;

    com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Attendance_ReportsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.shahin.classroomattendance.realm.Attendance_Reports>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$monthOnly() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.monthOnlyIndex);
    }

    @Override
    public void realmSet$monthOnly(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.monthOnlyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.monthOnlyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.monthOnlyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.monthOnlyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dateOnly() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateOnlyIndex);
    }

    @Override
    public void realmSet$dateOnly(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateOnlyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dateOnlyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateOnlyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dateOnlyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$classId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.classIdIndex);
    }

    @Override
    public void realmSet$classId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.classIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.classIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.classIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.classIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$date_and_classID() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.date_and_classIDIndex);
    }

    @Override
    public void realmSet$date_and_classID(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.date_and_classIDIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.date_and_classIDIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.date_and_classIDIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.date_and_classIDIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$classname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.classnameIndex);
    }

    @Override
    public void realmSet$classname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.classnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.classnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.classnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.classnameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$subjName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subjNameIndex);
    }

    @Override
    public void realmSet$subjName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.subjNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.subjNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.subjNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.subjNameIndex, value);
    }

    @Override
    public RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> realmGet$attendance_students_lists() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attendance_students_listsRealmList != null) {
            return attendance_students_listsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.attendance_students_listsIndex);
            attendance_students_listsRealmList = new RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List>(com.shahin.classroomattendance.realm.Attendance_Students_List.class, osList, proxyState.getRealm$realm());
            return attendance_students_listsRealmList;
        }
    }

    @Override
    public void realmSet$attendance_students_lists(RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attendance_students_lists")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> original = value;
                value = new RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List>();
                for (com.shahin.classroomattendance.realm.Attendance_Students_List item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.attendance_students_listsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.shahin.classroomattendance.realm.Attendance_Students_List linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.shahin.classroomattendance.realm.Attendance_Students_List linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Attendance_Reports", 8, 0);
        builder.addPersistedProperty("date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("monthOnly", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dateOnly", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("classId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date_and_classID", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("classname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("subjName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("attendance_students_lists", RealmFieldType.LIST, "Attendance_Students_List");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Attendance_ReportsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Attendance_ReportsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Attendance_Reports";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Attendance_Reports";
    }

    @SuppressWarnings("cast")
    public static com.shahin.classroomattendance.realm.Attendance_Reports createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("attendance_students_lists")) {
            excludeFields.add("attendance_students_lists");
        }
        com.shahin.classroomattendance.realm.Attendance_Reports obj = realm.createObjectInternal(com.shahin.classroomattendance.realm.Attendance_Reports.class, true, excludeFields);

        final com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) obj;
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                objProxy.realmSet$date((String) json.getString("date"));
            }
        }
        if (json.has("monthOnly")) {
            if (json.isNull("monthOnly")) {
                objProxy.realmSet$monthOnly(null);
            } else {
                objProxy.realmSet$monthOnly((String) json.getString("monthOnly"));
            }
        }
        if (json.has("dateOnly")) {
            if (json.isNull("dateOnly")) {
                objProxy.realmSet$dateOnly(null);
            } else {
                objProxy.realmSet$dateOnly((String) json.getString("dateOnly"));
            }
        }
        if (json.has("classId")) {
            if (json.isNull("classId")) {
                objProxy.realmSet$classId(null);
            } else {
                objProxy.realmSet$classId((String) json.getString("classId"));
            }
        }
        if (json.has("date_and_classID")) {
            if (json.isNull("date_and_classID")) {
                objProxy.realmSet$date_and_classID(null);
            } else {
                objProxy.realmSet$date_and_classID((String) json.getString("date_and_classID"));
            }
        }
        if (json.has("classname")) {
            if (json.isNull("classname")) {
                objProxy.realmSet$classname(null);
            } else {
                objProxy.realmSet$classname((String) json.getString("classname"));
            }
        }
        if (json.has("subjName")) {
            if (json.isNull("subjName")) {
                objProxy.realmSet$subjName(null);
            } else {
                objProxy.realmSet$subjName((String) json.getString("subjName"));
            }
        }
        if (json.has("attendance_students_lists")) {
            if (json.isNull("attendance_students_lists")) {
                objProxy.realmSet$attendance_students_lists(null);
            } else {
                objProxy.realmGet$attendance_students_lists().clear();
                JSONArray array = json.getJSONArray("attendance_students_lists");
                for (int i = 0; i < array.length(); i++) {
                    com.shahin.classroomattendance.realm.Attendance_Students_List item = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$attendance_students_lists().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.shahin.classroomattendance.realm.Attendance_Reports createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.shahin.classroomattendance.realm.Attendance_Reports obj = new com.shahin.classroomattendance.realm.Attendance_Reports();
        final com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                }
            } else if (name.equals("monthOnly")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$monthOnly((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$monthOnly(null);
                }
            } else if (name.equals("dateOnly")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateOnly((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dateOnly(null);
                }
            } else if (name.equals("classId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$classId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$classId(null);
                }
            } else if (name.equals("date_and_classID")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date_and_classID((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date_and_classID(null);
                }
            } else if (name.equals("classname")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$classname((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$classname(null);
                }
            } else if (name.equals("subjName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subjName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subjName(null);
                }
            } else if (name.equals("attendance_students_lists")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$attendance_students_lists(null);
                } else {
                    objProxy.realmSet$attendance_students_lists(new RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.shahin.classroomattendance.realm.Attendance_Students_List item = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$attendance_students_lists().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class), false, Collections.<String>emptyList());
        io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy obj = new io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.shahin.classroomattendance.realm.Attendance_Reports copyOrUpdate(Realm realm, Attendance_ReportsColumnInfo columnInfo, com.shahin.classroomattendance.realm.Attendance_Reports object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.shahin.classroomattendance.realm.Attendance_Reports) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.shahin.classroomattendance.realm.Attendance_Reports copy(Realm realm, Attendance_ReportsColumnInfo columnInfo, com.shahin.classroomattendance.realm.Attendance_Reports newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.shahin.classroomattendance.realm.Attendance_Reports) cachedRealmObject;
        }

        com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface realmObjectSource = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) newObject;

        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.dateIndex, realmObjectSource.realmGet$date());
        builder.addString(columnInfo.monthOnlyIndex, realmObjectSource.realmGet$monthOnly());
        builder.addString(columnInfo.dateOnlyIndex, realmObjectSource.realmGet$dateOnly());
        builder.addString(columnInfo.classIdIndex, realmObjectSource.realmGet$classId());
        builder.addString(columnInfo.date_and_classIDIndex, realmObjectSource.realmGet$date_and_classID());
        builder.addString(columnInfo.classnameIndex, realmObjectSource.realmGet$classname());
        builder.addString(columnInfo.subjNameIndex, realmObjectSource.realmGet$subjName());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsList = realmObjectSource.realmGet$attendance_students_lists();
        if (attendance_students_listsList != null) {
            RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsRealmList = realmObjectCopy.realmGet$attendance_students_lists();
            attendance_students_listsRealmList.clear();
            for (int i = 0; i < attendance_students_listsList.size(); i++) {
                com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem = attendance_students_listsList.get(i);
                com.shahin.classroomattendance.realm.Attendance_Students_List cacheattendance_students_lists = (com.shahin.classroomattendance.realm.Attendance_Students_List) cache.get(attendance_students_listsItem);
                if (cacheattendance_students_lists != null) {
                    attendance_students_listsRealmList.add(cacheattendance_students_lists);
                } else {
                    attendance_students_listsRealmList.add(com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.copyOrUpdate(realm, (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class), attendance_students_listsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.shahin.classroomattendance.realm.Attendance_Reports object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_ReportsColumnInfo columnInfo = (Attendance_ReportsColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$date = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        }
        String realmGet$monthOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$monthOnly();
        if (realmGet$monthOnly != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, realmGet$monthOnly, false);
        }
        String realmGet$dateOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$dateOnly();
        if (realmGet$dateOnly != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, realmGet$dateOnly, false);
        }
        String realmGet$classId = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classId();
        if (realmGet$classId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classIdIndex, rowIndex, realmGet$classId, false);
        }
        String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date_and_classID();
        if (realmGet$date_and_classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
        }
        String realmGet$classname = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classname();
        if (realmGet$classname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classnameIndex, rowIndex, realmGet$classname, false);
        }
        String realmGet$subjName = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$subjName();
        if (realmGet$subjName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjNameIndex, rowIndex, realmGet$subjName, false);
        }

        RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsList = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$attendance_students_lists();
        if (attendance_students_listsList != null) {
            OsList attendance_students_listsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attendance_students_listsIndex);
            for (com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem : attendance_students_listsList) {
                Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                if (cacheItemIndexattendance_students_lists == null) {
                    cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insert(realm, attendance_students_listsItem, cache);
                }
                attendance_students_listsOsList.addRow(cacheItemIndexattendance_students_lists);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_ReportsColumnInfo columnInfo = (Attendance_ReportsColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        com.shahin.classroomattendance.realm.Attendance_Reports object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Attendance_Reports) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$date = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            }
            String realmGet$monthOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$monthOnly();
            if (realmGet$monthOnly != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, realmGet$monthOnly, false);
            }
            String realmGet$dateOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$dateOnly();
            if (realmGet$dateOnly != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, realmGet$dateOnly, false);
            }
            String realmGet$classId = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classId();
            if (realmGet$classId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classIdIndex, rowIndex, realmGet$classId, false);
            }
            String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date_and_classID();
            if (realmGet$date_and_classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
            }
            String realmGet$classname = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classname();
            if (realmGet$classname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classnameIndex, rowIndex, realmGet$classname, false);
            }
            String realmGet$subjName = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$subjName();
            if (realmGet$subjName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjNameIndex, rowIndex, realmGet$subjName, false);
            }

            RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsList = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$attendance_students_lists();
            if (attendance_students_listsList != null) {
                OsList attendance_students_listsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attendance_students_listsIndex);
                for (com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem : attendance_students_listsList) {
                    Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                    if (cacheItemIndexattendance_students_lists == null) {
                        cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insert(realm, attendance_students_listsItem, cache);
                    }
                    attendance_students_listsOsList.addRow(cacheItemIndexattendance_students_lists);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.shahin.classroomattendance.realm.Attendance_Reports object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_ReportsColumnInfo columnInfo = (Attendance_ReportsColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$date = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        String realmGet$monthOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$monthOnly();
        if (realmGet$monthOnly != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, realmGet$monthOnly, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, false);
        }
        String realmGet$dateOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$dateOnly();
        if (realmGet$dateOnly != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, realmGet$dateOnly, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, false);
        }
        String realmGet$classId = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classId();
        if (realmGet$classId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classIdIndex, rowIndex, realmGet$classId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.classIdIndex, rowIndex, false);
        }
        String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date_and_classID();
        if (realmGet$date_and_classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, false);
        }
        String realmGet$classname = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classname();
        if (realmGet$classname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classnameIndex, rowIndex, realmGet$classname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.classnameIndex, rowIndex, false);
        }
        String realmGet$subjName = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$subjName();
        if (realmGet$subjName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjNameIndex, rowIndex, realmGet$subjName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subjNameIndex, rowIndex, false);
        }

        OsList attendance_students_listsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attendance_students_listsIndex);
        RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsList = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$attendance_students_lists();
        if (attendance_students_listsList != null && attendance_students_listsList.size() == attendance_students_listsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = attendance_students_listsList.size();
            for (int i = 0; i < objects; i++) {
                com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem = attendance_students_listsList.get(i);
                Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                if (cacheItemIndexattendance_students_lists == null) {
                    cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, attendance_students_listsItem, cache);
                }
                attendance_students_listsOsList.setRow(i, cacheItemIndexattendance_students_lists);
            }
        } else {
            attendance_students_listsOsList.removeAll();
            if (attendance_students_listsList != null) {
                for (com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem : attendance_students_listsList) {
                    Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                    if (cacheItemIndexattendance_students_lists == null) {
                        cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, attendance_students_listsItem, cache);
                    }
                    attendance_students_listsOsList.addRow(cacheItemIndexattendance_students_lists);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_ReportsColumnInfo columnInfo = (Attendance_ReportsColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Reports.class);
        com.shahin.classroomattendance.realm.Attendance_Reports object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Attendance_Reports) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$date = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
            String realmGet$monthOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$monthOnly();
            if (realmGet$monthOnly != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, realmGet$monthOnly, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.monthOnlyIndex, rowIndex, false);
            }
            String realmGet$dateOnly = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$dateOnly();
            if (realmGet$dateOnly != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, realmGet$dateOnly, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateOnlyIndex, rowIndex, false);
            }
            String realmGet$classId = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classId();
            if (realmGet$classId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classIdIndex, rowIndex, realmGet$classId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.classIdIndex, rowIndex, false);
            }
            String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$date_and_classID();
            if (realmGet$date_and_classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, false);
            }
            String realmGet$classname = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$classname();
            if (realmGet$classname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classnameIndex, rowIndex, realmGet$classname, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.classnameIndex, rowIndex, false);
            }
            String realmGet$subjName = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$subjName();
            if (realmGet$subjName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjNameIndex, rowIndex, realmGet$subjName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subjNameIndex, rowIndex, false);
            }

            OsList attendance_students_listsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attendance_students_listsIndex);
            RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> attendance_students_listsList = ((com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) object).realmGet$attendance_students_lists();
            if (attendance_students_listsList != null && attendance_students_listsList.size() == attendance_students_listsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = attendance_students_listsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem = attendance_students_listsList.get(i);
                    Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                    if (cacheItemIndexattendance_students_lists == null) {
                        cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, attendance_students_listsItem, cache);
                    }
                    attendance_students_listsOsList.setRow(i, cacheItemIndexattendance_students_lists);
                }
            } else {
                attendance_students_listsOsList.removeAll();
                if (attendance_students_listsList != null) {
                    for (com.shahin.classroomattendance.realm.Attendance_Students_List attendance_students_listsItem : attendance_students_listsList) {
                        Long cacheItemIndexattendance_students_lists = cache.get(attendance_students_listsItem);
                        if (cacheItemIndexattendance_students_lists == null) {
                            cacheItemIndexattendance_students_lists = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.insertOrUpdate(realm, attendance_students_listsItem, cache);
                        }
                        attendance_students_listsOsList.addRow(cacheItemIndexattendance_students_lists);
                    }
                }
            }

        }
    }

    public static com.shahin.classroomattendance.realm.Attendance_Reports createDetachedCopy(com.shahin.classroomattendance.realm.Attendance_Reports realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.shahin.classroomattendance.realm.Attendance_Reports unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.shahin.classroomattendance.realm.Attendance_Reports();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.shahin.classroomattendance.realm.Attendance_Reports) cachedObject.object;
            }
            unmanagedObject = (com.shahin.classroomattendance.realm.Attendance_Reports) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface unmanagedCopy = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) unmanagedObject;
        com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface realmSource = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$monthOnly(realmSource.realmGet$monthOnly());
        unmanagedCopy.realmSet$dateOnly(realmSource.realmGet$dateOnly());
        unmanagedCopy.realmSet$classId(realmSource.realmGet$classId());
        unmanagedCopy.realmSet$date_and_classID(realmSource.realmGet$date_and_classID());
        unmanagedCopy.realmSet$classname(realmSource.realmGet$classname());
        unmanagedCopy.realmSet$subjName(realmSource.realmGet$subjName());

        // Deep copy of attendance_students_lists
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$attendance_students_lists(null);
        } else {
            RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> managedattendance_students_listsList = realmSource.realmGet$attendance_students_lists();
            RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List> unmanagedattendance_students_listsList = new RealmList<com.shahin.classroomattendance.realm.Attendance_Students_List>();
            unmanagedCopy.realmSet$attendance_students_lists(unmanagedattendance_students_listsList);
            int nextDepth = currentDepth + 1;
            int size = managedattendance_students_listsList.size();
            for (int i = 0; i < size; i++) {
                com.shahin.classroomattendance.realm.Attendance_Students_List item = com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy.createDetachedCopy(managedattendance_students_listsList.get(i), nextDepth, maxDepth, cache);
                unmanagedattendance_students_listsList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Attendance_Reports = proxy[");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{monthOnly:");
        stringBuilder.append(realmGet$monthOnly() != null ? realmGet$monthOnly() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateOnly:");
        stringBuilder.append(realmGet$dateOnly() != null ? realmGet$dateOnly() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{classId:");
        stringBuilder.append(realmGet$classId() != null ? realmGet$classId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date_and_classID:");
        stringBuilder.append(realmGet$date_and_classID() != null ? realmGet$date_and_classID() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{classname:");
        stringBuilder.append(realmGet$classname() != null ? realmGet$classname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subjName:");
        stringBuilder.append(realmGet$subjName() != null ? realmGet$subjName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attendance_students_lists:");
        stringBuilder.append("RealmList<Attendance_Students_List>[").append(realmGet$attendance_students_lists().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy aAttendance_Reports = (com_shahin_classroomattendance_realm_Attendance_ReportsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttendance_Reports.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttendance_Reports.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttendance_Reports.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
