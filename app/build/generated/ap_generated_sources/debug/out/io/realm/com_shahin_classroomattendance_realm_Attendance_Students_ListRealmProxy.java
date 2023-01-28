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
public class com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy extends com.shahin.classroomattendance.realm.Attendance_Students_List
    implements RealmObjectProxy, com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface {

    static final class Attendance_Students_ListColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long studentNameIndex;
        long studentRegNoIndex;
        long attendanceIndex;
        long mobNoIndex;
        long classIDIndex;
        long date_and_classIDIndex;
        long unique_IDIndex;

        Attendance_Students_ListColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Attendance_Students_List");
            this.studentNameIndex = addColumnDetails("studentName", "studentName", objectSchemaInfo);
            this.studentRegNoIndex = addColumnDetails("studentRegNo", "studentRegNo", objectSchemaInfo);
            this.attendanceIndex = addColumnDetails("attendance", "attendance", objectSchemaInfo);
            this.mobNoIndex = addColumnDetails("mobNo", "mobNo", objectSchemaInfo);
            this.classIDIndex = addColumnDetails("classID", "classID", objectSchemaInfo);
            this.date_and_classIDIndex = addColumnDetails("date_and_classID", "date_and_classID", objectSchemaInfo);
            this.unique_IDIndex = addColumnDetails("unique_ID", "unique_ID", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        Attendance_Students_ListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Attendance_Students_ListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Attendance_Students_ListColumnInfo src = (Attendance_Students_ListColumnInfo) rawSrc;
            final Attendance_Students_ListColumnInfo dst = (Attendance_Students_ListColumnInfo) rawDst;
            dst.studentNameIndex = src.studentNameIndex;
            dst.studentRegNoIndex = src.studentRegNoIndex;
            dst.attendanceIndex = src.attendanceIndex;
            dst.mobNoIndex = src.mobNoIndex;
            dst.classIDIndex = src.classIDIndex;
            dst.date_and_classIDIndex = src.date_and_classIDIndex;
            dst.unique_IDIndex = src.unique_IDIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Attendance_Students_ListColumnInfo columnInfo;
    private ProxyState<com.shahin.classroomattendance.realm.Attendance_Students_List> proxyState;

    com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Attendance_Students_ListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.shahin.classroomattendance.realm.Attendance_Students_List>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$studentName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.studentNameIndex);
    }

    @Override
    public void realmSet$studentName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.studentNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.studentNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.studentNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.studentNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$studentRegNo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.studentRegNoIndex);
    }

    @Override
    public void realmSet$studentRegNo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.studentRegNoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.studentRegNoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.studentRegNoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.studentRegNoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$attendance() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.attendanceIndex);
    }

    @Override
    public void realmSet$attendance(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.attendanceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.attendanceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.attendanceIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.attendanceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mobNo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mobNoIndex);
    }

    @Override
    public void realmSet$mobNo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mobNoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mobNoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mobNoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mobNoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$classID() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.classIDIndex);
    }

    @Override
    public void realmSet$classID(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.classIDIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.classIDIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.classIDIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.classIDIndex, value);
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
    public String realmGet$unique_ID() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.unique_IDIndex);
    }

    @Override
    public void realmSet$unique_ID(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'unique_ID' cannot be changed after object was created.");
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Attendance_Students_List", 7, 0);
        builder.addPersistedProperty("studentName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("studentRegNo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("attendance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("mobNo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("classID", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date_and_classID", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("unique_ID", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Attendance_Students_ListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Attendance_Students_ListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Attendance_Students_List";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Attendance_Students_List";
    }

    @SuppressWarnings("cast")
    public static com.shahin.classroomattendance.realm.Attendance_Students_List createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.shahin.classroomattendance.realm.Attendance_Students_List obj = null;
        if (update) {
            Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
            Attendance_Students_ListColumnInfo columnInfo = (Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
            long pkColumnIndex = columnInfo.unique_IDIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("unique_ID")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("unique_ID"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("unique_ID")) {
                if (json.isNull("unique_ID")) {
                    obj = (io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy) realm.createObjectInternal(com.shahin.classroomattendance.realm.Attendance_Students_List.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy) realm.createObjectInternal(com.shahin.classroomattendance.realm.Attendance_Students_List.class, json.getString("unique_ID"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'unique_ID'.");
            }
        }

        final com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) obj;
        if (json.has("studentName")) {
            if (json.isNull("studentName")) {
                objProxy.realmSet$studentName(null);
            } else {
                objProxy.realmSet$studentName((String) json.getString("studentName"));
            }
        }
        if (json.has("studentRegNo")) {
            if (json.isNull("studentRegNo")) {
                objProxy.realmSet$studentRegNo(null);
            } else {
                objProxy.realmSet$studentRegNo((String) json.getString("studentRegNo"));
            }
        }
        if (json.has("attendance")) {
            if (json.isNull("attendance")) {
                objProxy.realmSet$attendance(null);
            } else {
                objProxy.realmSet$attendance((String) json.getString("attendance"));
            }
        }
        if (json.has("mobNo")) {
            if (json.isNull("mobNo")) {
                objProxy.realmSet$mobNo(null);
            } else {
                objProxy.realmSet$mobNo((String) json.getString("mobNo"));
            }
        }
        if (json.has("classID")) {
            if (json.isNull("classID")) {
                objProxy.realmSet$classID(null);
            } else {
                objProxy.realmSet$classID((String) json.getString("classID"));
            }
        }
        if (json.has("date_and_classID")) {
            if (json.isNull("date_and_classID")) {
                objProxy.realmSet$date_and_classID(null);
            } else {
                objProxy.realmSet$date_and_classID((String) json.getString("date_and_classID"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.shahin.classroomattendance.realm.Attendance_Students_List createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.shahin.classroomattendance.realm.Attendance_Students_List obj = new com.shahin.classroomattendance.realm.Attendance_Students_List();
        final com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("studentName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$studentName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$studentName(null);
                }
            } else if (name.equals("studentRegNo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$studentRegNo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$studentRegNo(null);
                }
            } else if (name.equals("attendance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$attendance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$attendance(null);
                }
            } else if (name.equals("mobNo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mobNo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mobNo(null);
                }
            } else if (name.equals("classID")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$classID((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$classID(null);
                }
            } else if (name.equals("date_and_classID")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date_and_classID((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date_and_classID(null);
                }
            } else if (name.equals("unique_ID")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$unique_ID((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$unique_ID(null);
                }
                jsonHasPrimaryKey = true;
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'unique_ID'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class), false, Collections.<String>emptyList());
        io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy obj = new io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.shahin.classroomattendance.realm.Attendance_Students_List copyOrUpdate(Realm realm, Attendance_Students_ListColumnInfo columnInfo, com.shahin.classroomattendance.realm.Attendance_Students_List object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.shahin.classroomattendance.realm.Attendance_Students_List) cachedRealmObject;
        }

        com.shahin.classroomattendance.realm.Attendance_Students_List realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
            long pkColumnIndex = columnInfo.unique_IDIndex;
            String value = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$unique_ID();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.shahin.classroomattendance.realm.Attendance_Students_List copy(Realm realm, Attendance_Students_ListColumnInfo columnInfo, com.shahin.classroomattendance.realm.Attendance_Students_List newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.shahin.classroomattendance.realm.Attendance_Students_List) cachedRealmObject;
        }

        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface realmObjectSource = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) newObject;

        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.studentNameIndex, realmObjectSource.realmGet$studentName());
        builder.addString(columnInfo.studentRegNoIndex, realmObjectSource.realmGet$studentRegNo());
        builder.addString(columnInfo.attendanceIndex, realmObjectSource.realmGet$attendance());
        builder.addString(columnInfo.mobNoIndex, realmObjectSource.realmGet$mobNo());
        builder.addString(columnInfo.classIDIndex, realmObjectSource.realmGet$classID());
        builder.addString(columnInfo.date_and_classIDIndex, realmObjectSource.realmGet$date_and_classID());
        builder.addString(columnInfo.unique_IDIndex, realmObjectSource.realmGet$unique_ID());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.shahin.classroomattendance.realm.Attendance_Students_List object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_Students_ListColumnInfo columnInfo = (Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long pkColumnIndex = columnInfo.unique_IDIndex;
        String primaryKeyValue = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$unique_ID();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$studentName = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentName();
        if (realmGet$studentName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.studentNameIndex, rowIndex, realmGet$studentName, false);
        }
        String realmGet$studentRegNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentRegNo();
        if (realmGet$studentRegNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, realmGet$studentRegNo, false);
        }
        String realmGet$attendance = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$attendance();
        if (realmGet$attendance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attendanceIndex, rowIndex, realmGet$attendance, false);
        }
        String realmGet$mobNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$mobNo();
        if (realmGet$mobNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobNoIndex, rowIndex, realmGet$mobNo, false);
        }
        String realmGet$classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$classID();
        if (realmGet$classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classIDIndex, rowIndex, realmGet$classID, false);
        }
        String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$date_and_classID();
        if (realmGet$date_and_classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_Students_ListColumnInfo columnInfo = (Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long pkColumnIndex = columnInfo.unique_IDIndex;
        com.shahin.classroomattendance.realm.Attendance_Students_List object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Attendance_Students_List) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$unique_ID();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$studentName = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentName();
            if (realmGet$studentName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.studentNameIndex, rowIndex, realmGet$studentName, false);
            }
            String realmGet$studentRegNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentRegNo();
            if (realmGet$studentRegNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, realmGet$studentRegNo, false);
            }
            String realmGet$attendance = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$attendance();
            if (realmGet$attendance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attendanceIndex, rowIndex, realmGet$attendance, false);
            }
            String realmGet$mobNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$mobNo();
            if (realmGet$mobNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobNoIndex, rowIndex, realmGet$mobNo, false);
            }
            String realmGet$classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$classID();
            if (realmGet$classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classIDIndex, rowIndex, realmGet$classID, false);
            }
            String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$date_and_classID();
            if (realmGet$date_and_classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.shahin.classroomattendance.realm.Attendance_Students_List object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_Students_ListColumnInfo columnInfo = (Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long pkColumnIndex = columnInfo.unique_IDIndex;
        String primaryKeyValue = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$unique_ID();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$studentName = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentName();
        if (realmGet$studentName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.studentNameIndex, rowIndex, realmGet$studentName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.studentNameIndex, rowIndex, false);
        }
        String realmGet$studentRegNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentRegNo();
        if (realmGet$studentRegNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, realmGet$studentRegNo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, false);
        }
        String realmGet$attendance = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$attendance();
        if (realmGet$attendance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attendanceIndex, rowIndex, realmGet$attendance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.attendanceIndex, rowIndex, false);
        }
        String realmGet$mobNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$mobNo();
        if (realmGet$mobNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobNoIndex, rowIndex, realmGet$mobNo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mobNoIndex, rowIndex, false);
        }
        String realmGet$classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$classID();
        if (realmGet$classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.classIDIndex, rowIndex, realmGet$classID, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.classIDIndex, rowIndex, false);
        }
        String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$date_and_classID();
        if (realmGet$date_and_classID != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Attendance_Students_ListColumnInfo columnInfo = (Attendance_Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        long pkColumnIndex = columnInfo.unique_IDIndex;
        com.shahin.classroomattendance.realm.Attendance_Students_List object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Attendance_Students_List) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$unique_ID();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$studentName = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentName();
            if (realmGet$studentName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.studentNameIndex, rowIndex, realmGet$studentName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.studentNameIndex, rowIndex, false);
            }
            String realmGet$studentRegNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$studentRegNo();
            if (realmGet$studentRegNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, realmGet$studentRegNo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.studentRegNoIndex, rowIndex, false);
            }
            String realmGet$attendance = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$attendance();
            if (realmGet$attendance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attendanceIndex, rowIndex, realmGet$attendance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.attendanceIndex, rowIndex, false);
            }
            String realmGet$mobNo = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$mobNo();
            if (realmGet$mobNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobNoIndex, rowIndex, realmGet$mobNo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mobNoIndex, rowIndex, false);
            }
            String realmGet$classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$classID();
            if (realmGet$classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.classIDIndex, rowIndex, realmGet$classID, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.classIDIndex, rowIndex, false);
            }
            String realmGet$date_and_classID = ((com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) object).realmGet$date_and_classID();
            if (realmGet$date_and_classID != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, realmGet$date_and_classID, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.date_and_classIDIndex, rowIndex, false);
            }
        }
    }

    public static com.shahin.classroomattendance.realm.Attendance_Students_List createDetachedCopy(com.shahin.classroomattendance.realm.Attendance_Students_List realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.shahin.classroomattendance.realm.Attendance_Students_List unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.shahin.classroomattendance.realm.Attendance_Students_List();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.shahin.classroomattendance.realm.Attendance_Students_List) cachedObject.object;
            }
            unmanagedObject = (com.shahin.classroomattendance.realm.Attendance_Students_List) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface unmanagedCopy = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) unmanagedObject;
        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface realmSource = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$studentName(realmSource.realmGet$studentName());
        unmanagedCopy.realmSet$studentRegNo(realmSource.realmGet$studentRegNo());
        unmanagedCopy.realmSet$attendance(realmSource.realmGet$attendance());
        unmanagedCopy.realmSet$mobNo(realmSource.realmGet$mobNo());
        unmanagedCopy.realmSet$classID(realmSource.realmGet$classID());
        unmanagedCopy.realmSet$date_and_classID(realmSource.realmGet$date_and_classID());
        unmanagedCopy.realmSet$unique_ID(realmSource.realmGet$unique_ID());

        return unmanagedObject;
    }

    static com.shahin.classroomattendance.realm.Attendance_Students_List update(Realm realm, Attendance_Students_ListColumnInfo columnInfo, com.shahin.classroomattendance.realm.Attendance_Students_List realmObject, com.shahin.classroomattendance.realm.Attendance_Students_List newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface realmObjectTarget = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) realmObject;
        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface realmObjectSource = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxyInterface) newObject;
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Attendance_Students_List.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.studentNameIndex, realmObjectSource.realmGet$studentName());
        builder.addString(columnInfo.studentRegNoIndex, realmObjectSource.realmGet$studentRegNo());
        builder.addString(columnInfo.attendanceIndex, realmObjectSource.realmGet$attendance());
        builder.addString(columnInfo.mobNoIndex, realmObjectSource.realmGet$mobNo());
        builder.addString(columnInfo.classIDIndex, realmObjectSource.realmGet$classID());
        builder.addString(columnInfo.date_and_classIDIndex, realmObjectSource.realmGet$date_and_classID());
        builder.addString(columnInfo.unique_IDIndex, realmObjectSource.realmGet$unique_ID());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Attendance_Students_List = proxy[");
        stringBuilder.append("{studentName:");
        stringBuilder.append(realmGet$studentName() != null ? realmGet$studentName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{studentRegNo:");
        stringBuilder.append(realmGet$studentRegNo() != null ? realmGet$studentRegNo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attendance:");
        stringBuilder.append(realmGet$attendance() != null ? realmGet$attendance() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mobNo:");
        stringBuilder.append(realmGet$mobNo() != null ? realmGet$mobNo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{classID:");
        stringBuilder.append(realmGet$classID() != null ? realmGet$classID() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date_and_classID:");
        stringBuilder.append(realmGet$date_and_classID() != null ? realmGet$date_and_classID() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{unique_ID:");
        stringBuilder.append(realmGet$unique_ID() != null ? realmGet$unique_ID() : "null");
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
        com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy aAttendance_Students_List = (com_shahin_classroomattendance_realm_Attendance_Students_ListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttendance_Students_List.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttendance_Students_List.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttendance_Students_List.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
