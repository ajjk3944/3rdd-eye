.class public abstract LI3/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr3/d;

.field public static final b:Lr3/d;

.field public static final c:Lr3/d;

.field public static final d:Lr3/d;

.field public static final e:Lr3/d;

.field public static final f:Lr3/d;

.field public static final g:Lr3/d;

.field public static final h:Lr3/d;

.field public static final i:Lr3/d;

.field public static final j:Lr3/d;

.field public static final k:Lr3/d;

.field public static final l:Lr3/d;

.field public static final m:Lr3/d;

.field public static final n:Lr3/d;

.field public static final o:Lr3/d;

.field public static final p:[Lr3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lr3/d;

    const-string v1, "name_ulr_private"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, LI3/w;->a:Lr3/d;

    new-instance v1, Lr3/d;

    const-string v4, "name_sleep_segment_request"

    invoke-direct {v1, v4, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, LI3/w;->b:Lr3/d;

    new-instance v4, Lr3/d;

    const-string v5, "get_last_activity_feature_id"

    invoke-direct {v4, v5, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, LI3/w;->c:Lr3/d;

    new-instance v5, Lr3/d;

    const-string v6, "support_context_feature_id"

    invoke-direct {v5, v6, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, LI3/w;->d:Lr3/d;

    new-instance v6, Lr3/d;

    const-string v7, "get_current_location"

    const-wide/16 v8, 0x2

    invoke-direct {v6, v7, v8, v9}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, LI3/w;->e:Lr3/d;

    new-instance v7, Lr3/d;

    const-string v8, "get_last_location_with_request"

    invoke-direct {v7, v8, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, LI3/w;->f:Lr3/d;

    new-instance v8, Lr3/d;

    const-string v9, "set_mock_mode_with_callback"

    invoke-direct {v8, v9, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, LI3/w;->g:Lr3/d;

    new-instance v9, Lr3/d;

    const-string v10, "set_mock_location_with_callback"

    invoke-direct {v9, v10, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, LI3/w;->h:Lr3/d;

    new-instance v10, Lr3/d;

    const-string v11, "inject_location_with_callback"

    invoke-direct {v10, v11, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v10, LI3/w;->i:Lr3/d;

    new-instance v11, Lr3/d;

    const-string v12, "location_updates_with_callback"

    invoke-direct {v11, v12, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, LI3/w;->j:Lr3/d;

    new-instance v12, Lr3/d;

    const-string v13, "use_safe_parcelable_in_intents"

    invoke-direct {v12, v13, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v12, LI3/w;->k:Lr3/d;

    new-instance v13, Lr3/d;

    const-string v14, "flp_debug_updates"

    invoke-direct {v13, v14, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, LI3/w;->l:Lr3/d;

    new-instance v14, Lr3/d;

    const-string v15, "google_location_accuracy_enabled"

    invoke-direct {v14, v15, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v14, LI3/w;->m:Lr3/d;

    new-instance v15, Lr3/d;

    move-object/from16 v16, v14

    const-string v14, "geofences_with_callback"

    invoke-direct {v15, v14, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v15, LI3/w;->n:Lr3/d;

    new-instance v14, Lr3/d;

    move-object/from16 v17, v15

    const-string v15, "location_enabled"

    invoke-direct {v14, v15, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v14, LI3/w;->o:Lr3/d;

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    filled-new-array/range {v0 .. v14}, [Lr3/d;

    move-result-object v0

    sput-object v0, LI3/w;->p:[Lr3/d;

    return-void
.end method
