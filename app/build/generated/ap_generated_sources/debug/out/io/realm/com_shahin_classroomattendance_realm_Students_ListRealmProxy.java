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
public class com_shahin_classroomattendance_realm_Students_ListRealmProxy extends com.shahin.classroomattendance.realm.Students_List
    implements RealmObjectProxy, com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface {

    static final class Students_ListColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long name_studentIndex;
        long regNo_studentIndex;
        long mobileNo_studentIndex;
        long class_idIndex;

        Students_ListColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Students_List");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.name_studentIndex = addColumnDetails("name_student", "name_student", objectSchemaInfo);
            this.regNo_studentIndex = addColumnDetails("regNo_student", "regNo_student", objectSchemaInfo);
            this.mobileNo_studentIndex = addColumnDetails("mobileNo_student", "mobileNo_student", objectSchemaInfo);
            this.class_idIndex = addColumnDetails("class_id", "class_id", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        Students_ListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Students_ListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Students_ListColumnInfo src = (Students_ListColumnInfo) rawSrc;
            final Students_ListColumnInfo dst = (Students_ListColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.name_studentIndex = src.name_studentIndex;
            dst.regNo_studentIndex = src.regNo_studentIndex;
            dst.mobileNo_studentIndex = src.mobileNo_studentIndex;
            dst.class_idIndex = src.class_idIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Students_ListColumnInfo columnInfo;
    private ProxyState<com.shahin.classroomattendance.realm.Students_List> proxyState;

    com_shahin_classroomattendance_realm_Students_ListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Students_ListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.shahin.classroomattendance.realm.Students_List>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name_student() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.name_studentIndex);
    }

    @Override
    public void realmSet$name_student(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.name_studentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.name_studentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.name_studentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.name_studentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$regNo_student() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.regNo_studentIndex);
    }

    @Override
    public void realmSet$regNo_student(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.regNo_studentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.regNo_studentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.regNo_studentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.regNo_studentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mobileNo_student() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mobileNo_studentIndex);
    }

    @Override
    public void realmSet$mobileNo_student(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mobileNo_studentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mobileNo_studentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mobileNo_studentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mobileNo_studentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$class_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.class_idIndex);
    }

    @Override
    public void realmSet$class_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.class_idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.class_idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.class_idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.class_idIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Students_List", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name_student", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("regNo_student", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("mobileNo_student", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("class_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Students_ListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Students_ListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Students_List";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Students_List";
    }

    @SuppressWarnings("cast")
    public static com.shahin.classroomattendance.realm.Students_List createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.shahin.classroomattendance.realm.Students_List obj = realm.createObjectInternal(com.shahin.classroomattendance.realm.Students_List.class, true, excludeFields);

        final com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("name_student")) {
            if (json.isNull("name_student")) {
                objProxy.realmSet$name_student(null);
            } else {
                objProxy.realmSet$name_student((String) json.getString("name_student"));
            }
        }
        if (json.has("regNo_student")) {
            if (json.isNull("regNo_student")) {
                objProxy.realmSet$regNo_student(null);
            } else {
                objProxy.realmSet$regNo_student((String) json.getString("regNo_student"));
            }
        }
        if (json.has("mobileNo_student")) {
            if (json.isNull("mobileNo_student")) {
                objProxy.realmSet$mobileNo_student(null);
            } else {
                objProxy.realmSet$mobileNo_student((String) json.getString("mobileNo_student"));
            }
        }
        if (json.has("class_id")) {
            if (json.isNull("class_id")) {
                objProxy.realmSet$class_id(null);
            } else {
                objProxy.realmSet$class_id((String) json.getString("class_id"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.shahin.classroomattendance.realm.Students_List createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.shahin.classroomattendance.realm.Students_List obj = new com.shahin.classroomattendance.realm.Students_List();
        final com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("name_student")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name_student((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name_student(null);
                }
            } else if (name.equals("regNo_student")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$regNo_student((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$regNo_student(null);
                }
            } else if (name.equals("mobileNo_student")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mobileNo_student((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mobileNo_student(null);
                }
            } else if (name.equals("class_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$class_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$class_id(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_shahin_classroomattendance_realm_Students_ListRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class), false, Collections.<String>emptyList());
        io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy obj = new io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.shahin.classroomattendance.realm.Students_List copyOrUpdate(Realm realm, Students_ListColumnInfo columnInfo, com.shahin.classroomattendance.realm.Students_List object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.shahin.classroomattendance.realm.Students_List) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.shahin.classroomattendance.realm.Students_List copy(Realm realm, Students_ListColumnInfo columnInfo, com.shahin.classroomattendance.realm.Students_List newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.shahin.classroomattendance.realm.Students_List) cachedRealmObject;
        }

        com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface realmObjectSource = (com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) newObject;

        Table table = realm.getTable(com.shahin.classroomattendance.realm.Students_List.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.name_studentIndex, realmObjectSource.realmGet$name_student());
        builder.addString(columnInfo.regNo_studentIndex, realmObjectSource.realmGet$regNo_student());
        builder.addString(columnInfo.mobileNo_studentIndex, realmObjectSource.realmGet$mobileNo_student());
        builder.addString(columnInfo.class_idIndex, realmObjectSource.realmGet$class_id());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_shahin_classroomattendance_realm_Students_ListRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.shahin.classroomattendance.realm.Students_List object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Students_ListColumnInfo columnInfo = (Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$name_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$name_student();
        if (realmGet$name_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_studentIndex, rowIndex, realmGet$name_student, false);
        }
        String realmGet$regNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$regNo_student();
        if (realmGet$regNo_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, realmGet$regNo_student, false);
        }
        String realmGet$mobileNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$mobileNo_student();
        if (realmGet$mobileNo_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, realmGet$mobileNo_student, false);
        }
        String realmGet$class_id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$class_id();
        if (realmGet$class_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.class_idIndex, rowIndex, realmGet$class_id, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Students_ListColumnInfo columnInfo = (Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class);
        com.shahin.classroomattendance.realm.Students_List object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Students_List) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            String realmGet$name_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$name_student();
            if (realmGet$name_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_studentIndex, rowIndex, realmGet$name_student, false);
            }
            String realmGet$regNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$regNo_student();
            if (realmGet$regNo_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, realmGet$regNo_student, false);
            }
            String realmGet$mobileNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$mobileNo_student();
            if (realmGet$mobileNo_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, realmGet$mobileNo_student, false);
            }
            String realmGet$class_id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$class_id();
            if (realmGet$class_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.class_idIndex, rowIndex, realmGet$class_id, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.shahin.classroomattendance.realm.Students_List object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Students_ListColumnInfo columnInfo = (Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$name_student();
        if (realmGet$name_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_studentIndex, rowIndex, realmGet$name_student, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.name_studentIndex, rowIndex, false);
        }
        String realmGet$regNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$regNo_student();
        if (realmGet$regNo_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, realmGet$regNo_student, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, false);
        }
        String realmGet$mobileNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$mobileNo_student();
        if (realmGet$mobileNo_student != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, realmGet$mobileNo_student, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, false);
        }
        String realmGet$class_id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$class_id();
        if (realmGet$class_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.class_idIndex, rowIndex, realmGet$class_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.class_idIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Students_List.class);
        long tableNativePtr = table.getNativePtr();
        Students_ListColumnInfo columnInfo = (Students_ListColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Students_List.class);
        com.shahin.classroomattendance.realm.Students_List object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Students_List) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$name_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$name_student();
            if (realmGet$name_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_studentIndex, rowIndex, realmGet$name_student, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.name_studentIndex, rowIndex, false);
            }
            String realmGet$regNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$regNo_student();
            if (realmGet$regNo_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, realmGet$regNo_student, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.regNo_studentIndex, rowIndex, false);
            }
            String realmGet$mobileNo_student = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$mobileNo_student();
            if (realmGet$mobileNo_student != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, realmGet$mobileNo_student, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mobileNo_studentIndex, rowIndex, false);
            }
            String realmGet$class_id = ((com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) object).realmGet$class_id();
            if (realmGet$class_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.class_idIndex, rowIndex, realmGet$class_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.class_idIndex, rowIndex, false);
            }
        }
    }

    public static com.shahin.classroomattendance.realm.Students_List createDetachedCopy(com.shahin.classroomattendance.realm.Students_List realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.shahin.classroomattendance.realm.Students_List unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.shahin.classroomattendance.realm.Students_List();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.shahin.classroomattendance.realm.Students_List) cachedObject.object;
            }
            unmanagedObject = (com.shahin.classroomattendance.realm.Students_List) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface unmanagedCopy = (com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) unmanagedObject;
        com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface realmSource = (com_shahin_classroomattendance_realm_Students_ListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name_student(realmSource.realmGet$name_student());
        unmanagedCopy.realmSet$regNo_student(realmSource.realmGet$regNo_student());
        unmanagedCopy.realmSet$mobileNo_student(realmSource.realmGet$mobileNo_student());
        unmanagedCopy.realmSet$class_id(realmSource.realmGet$class_id());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Students_List = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name_student:");
        stringBuilder.append(realmGet$name_student() != null ? realmGet$name_student() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{regNo_student:");
        stringBuilder.append(realmGet$regNo_student() != null ? realmGet$regNo_student() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mobileNo_student:");
        stringBuilder.append(realmGet$mobileNo_student() != null ? realmGet$mobileNo_student() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{class_id:");
        stringBuilder.append(realmGet$class_id() != null ? realmGet$class_id() : "null");
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
        com_shahin_classroomattendance_realm_Students_ListRealmProxy aStudents_List = (com_shahin_classroomattendance_realm_Students_ListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aStudents_List.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aStudents_List.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aStudents_List.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
