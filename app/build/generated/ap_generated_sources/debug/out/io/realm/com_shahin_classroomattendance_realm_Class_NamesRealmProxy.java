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
public class com_shahin_classroomattendance_realm_Class_NamesRealmProxy extends com.shahin.classroomattendance.realm.Class_Names
    implements RealmObjectProxy, com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface {

    static final class Class_NamesColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long name_classIndex;
        long name_subjectIndex;
        long position_bgIndex;

        Class_NamesColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Class_Names");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.name_classIndex = addColumnDetails("name_class", "name_class", objectSchemaInfo);
            this.name_subjectIndex = addColumnDetails("name_subject", "name_subject", objectSchemaInfo);
            this.position_bgIndex = addColumnDetails("position_bg", "position_bg", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        Class_NamesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Class_NamesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Class_NamesColumnInfo src = (Class_NamesColumnInfo) rawSrc;
            final Class_NamesColumnInfo dst = (Class_NamesColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.name_classIndex = src.name_classIndex;
            dst.name_subjectIndex = src.name_subjectIndex;
            dst.position_bgIndex = src.position_bgIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Class_NamesColumnInfo columnInfo;
    private ProxyState<com.shahin.classroomattendance.realm.Class_Names> proxyState;

    com_shahin_classroomattendance_realm_Class_NamesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Class_NamesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.shahin.classroomattendance.realm.Class_Names>(this);
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
    public String realmGet$name_class() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.name_classIndex);
    }

    @Override
    public void realmSet$name_class(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.name_classIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.name_classIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.name_classIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.name_classIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name_subject() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.name_subjectIndex);
    }

    @Override
    public void realmSet$name_subject(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.name_subjectIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.name_subjectIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.name_subjectIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.name_subjectIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$position_bg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.position_bgIndex);
    }

    @Override
    public void realmSet$position_bg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.position_bgIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.position_bgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.position_bgIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.position_bgIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Class_Names", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name_class", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name_subject", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("position_bg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Class_NamesColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Class_NamesColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Class_Names";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Class_Names";
    }

    @SuppressWarnings("cast")
    public static com.shahin.classroomattendance.realm.Class_Names createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.shahin.classroomattendance.realm.Class_Names obj = realm.createObjectInternal(com.shahin.classroomattendance.realm.Class_Names.class, true, excludeFields);

        final com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("name_class")) {
            if (json.isNull("name_class")) {
                objProxy.realmSet$name_class(null);
            } else {
                objProxy.realmSet$name_class((String) json.getString("name_class"));
            }
        }
        if (json.has("name_subject")) {
            if (json.isNull("name_subject")) {
                objProxy.realmSet$name_subject(null);
            } else {
                objProxy.realmSet$name_subject((String) json.getString("name_subject"));
            }
        }
        if (json.has("position_bg")) {
            if (json.isNull("position_bg")) {
                objProxy.realmSet$position_bg(null);
            } else {
                objProxy.realmSet$position_bg((String) json.getString("position_bg"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.shahin.classroomattendance.realm.Class_Names createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.shahin.classroomattendance.realm.Class_Names obj = new com.shahin.classroomattendance.realm.Class_Names();
        final com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface objProxy = (com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) obj;
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
            } else if (name.equals("name_class")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name_class((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name_class(null);
                }
            } else if (name.equals("name_subject")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name_subject((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name_subject(null);
                }
            } else if (name.equals("position_bg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$position_bg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$position_bg(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_shahin_classroomattendance_realm_Class_NamesRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class), false, Collections.<String>emptyList());
        io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy obj = new io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.shahin.classroomattendance.realm.Class_Names copyOrUpdate(Realm realm, Class_NamesColumnInfo columnInfo, com.shahin.classroomattendance.realm.Class_Names object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.shahin.classroomattendance.realm.Class_Names) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.shahin.classroomattendance.realm.Class_Names copy(Realm realm, Class_NamesColumnInfo columnInfo, com.shahin.classroomattendance.realm.Class_Names newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.shahin.classroomattendance.realm.Class_Names) cachedRealmObject;
        }

        com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface realmObjectSource = (com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) newObject;

        Table table = realm.getTable(com.shahin.classroomattendance.realm.Class_Names.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.name_classIndex, realmObjectSource.realmGet$name_class());
        builder.addString(columnInfo.name_subjectIndex, realmObjectSource.realmGet$name_subject());
        builder.addString(columnInfo.position_bgIndex, realmObjectSource.realmGet$position_bg());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_shahin_classroomattendance_realm_Class_NamesRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.shahin.classroomattendance.realm.Class_Names object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Class_Names.class);
        long tableNativePtr = table.getNativePtr();
        Class_NamesColumnInfo columnInfo = (Class_NamesColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$name_class = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_class();
        if (realmGet$name_class != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_classIndex, rowIndex, realmGet$name_class, false);
        }
        String realmGet$name_subject = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_subject();
        if (realmGet$name_subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, realmGet$name_subject, false);
        }
        String realmGet$position_bg = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$position_bg();
        if (realmGet$position_bg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.position_bgIndex, rowIndex, realmGet$position_bg, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Class_Names.class);
        long tableNativePtr = table.getNativePtr();
        Class_NamesColumnInfo columnInfo = (Class_NamesColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class);
        com.shahin.classroomattendance.realm.Class_Names object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Class_Names) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            String realmGet$name_class = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_class();
            if (realmGet$name_class != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_classIndex, rowIndex, realmGet$name_class, false);
            }
            String realmGet$name_subject = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_subject();
            if (realmGet$name_subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, realmGet$name_subject, false);
            }
            String realmGet$position_bg = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$position_bg();
            if (realmGet$position_bg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.position_bgIndex, rowIndex, realmGet$position_bg, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.shahin.classroomattendance.realm.Class_Names object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Class_Names.class);
        long tableNativePtr = table.getNativePtr();
        Class_NamesColumnInfo columnInfo = (Class_NamesColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name_class = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_class();
        if (realmGet$name_class != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_classIndex, rowIndex, realmGet$name_class, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.name_classIndex, rowIndex, false);
        }
        String realmGet$name_subject = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_subject();
        if (realmGet$name_subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, realmGet$name_subject, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, false);
        }
        String realmGet$position_bg = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$position_bg();
        if (realmGet$position_bg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.position_bgIndex, rowIndex, realmGet$position_bg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.position_bgIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.shahin.classroomattendance.realm.Class_Names.class);
        long tableNativePtr = table.getNativePtr();
        Class_NamesColumnInfo columnInfo = (Class_NamesColumnInfo) realm.getSchema().getColumnInfo(com.shahin.classroomattendance.realm.Class_Names.class);
        com.shahin.classroomattendance.realm.Class_Names object = null;
        while (objects.hasNext()) {
            object = (com.shahin.classroomattendance.realm.Class_Names) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$name_class = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_class();
            if (realmGet$name_class != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_classIndex, rowIndex, realmGet$name_class, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.name_classIndex, rowIndex, false);
            }
            String realmGet$name_subject = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$name_subject();
            if (realmGet$name_subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, realmGet$name_subject, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.name_subjectIndex, rowIndex, false);
            }
            String realmGet$position_bg = ((com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) object).realmGet$position_bg();
            if (realmGet$position_bg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.position_bgIndex, rowIndex, realmGet$position_bg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.position_bgIndex, rowIndex, false);
            }
        }
    }

    public static com.shahin.classroomattendance.realm.Class_Names createDetachedCopy(com.shahin.classroomattendance.realm.Class_Names realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.shahin.classroomattendance.realm.Class_Names unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.shahin.classroomattendance.realm.Class_Names();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.shahin.classroomattendance.realm.Class_Names) cachedObject.object;
            }
            unmanagedObject = (com.shahin.classroomattendance.realm.Class_Names) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface unmanagedCopy = (com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) unmanagedObject;
        com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface realmSource = (com_shahin_classroomattendance_realm_Class_NamesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name_class(realmSource.realmGet$name_class());
        unmanagedCopy.realmSet$name_subject(realmSource.realmGet$name_subject());
        unmanagedCopy.realmSet$position_bg(realmSource.realmGet$position_bg());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Class_Names = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name_class:");
        stringBuilder.append(realmGet$name_class() != null ? realmGet$name_class() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name_subject:");
        stringBuilder.append(realmGet$name_subject() != null ? realmGet$name_subject() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{position_bg:");
        stringBuilder.append(realmGet$position_bg() != null ? realmGet$position_bg() : "null");
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
        com_shahin_classroomattendance_realm_Class_NamesRealmProxy aClass_Names = (com_shahin_classroomattendance_realm_Class_NamesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aClass_Names.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aClass_Names.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aClass_Names.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
