.class public final LQ1/f;
.super Landroidx/datastore/preferences/protobuf/v;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ1/f$a;,
        LQ1/f$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LQ1/f;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/V; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/V;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Landroidx/datastore/preferences/protobuf/G;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/G;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ1/f;

    invoke-direct {v0}, LQ1/f;-><init>()V

    sput-object v0, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    const-class v1, LQ1/f;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/v;->E(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/v;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/v;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/G;->n()Landroidx/datastore/preferences/protobuf/G;

    move-result-object v0

    iput-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    return-void
.end method

.method static synthetic G()LQ1/f;
    .locals 1

    sget-object v0, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    return-object v0
.end method

.method static synthetic H(LQ1/f;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, LQ1/f;->I()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private I()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, LQ1/f;->L()Landroidx/datastore/preferences/protobuf/G;

    move-result-object v0

    return-object v0
.end method

.method private L()Landroidx/datastore/preferences/protobuf/G;
    .locals 1

    iget-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/G;->B()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/G;->P()Landroidx/datastore/preferences/protobuf/G;

    move-result-object v0

    iput-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    :cond_0
    iget-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    return-object v0
.end method

.method private M()Landroidx/datastore/preferences/protobuf/G;
    .locals 1

    iget-object v0, p0, LQ1/f;->preferences_:Landroidx/datastore/preferences/protobuf/G;

    return-object v0
.end method

.method public static N()LQ1/f$a;
    .locals 1

    sget-object v0, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->n()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    check-cast v0, LQ1/f$a;

    return-object v0
.end method

.method public static O(Ljava/io/InputStream;)LQ1/f;
    .locals 1

    sget-object v0, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    invoke-static {v0, p0}, Landroidx/datastore/preferences/protobuf/v;->C(Landroidx/datastore/preferences/protobuf/v;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/v;

    move-result-object p0

    check-cast p0, LQ1/f;

    return-object p0
.end method


# virtual methods
.method public K()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, LQ1/f;->M()Landroidx/datastore/preferences/protobuf/G;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final q(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, LQ1/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, LQ1/f;->PARSER:Landroidx/datastore/preferences/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LQ1/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, LQ1/f;->PARSER:Landroidx/datastore/preferences/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/v$b;

    sget-object p3, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/v$b;-><init>(Landroidx/datastore/preferences/protobuf/v;)V

    sput-object p1, LQ1/f;->PARSER:Landroidx/datastore/preferences/protobuf/V;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_3
    sget-object p1, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    return-object p1

    :pswitch_4
    const-string p1, "preferences_"

    sget-object p2, LQ1/f$b;->a:Landroidx/datastore/preferences/protobuf/F;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, LQ1/f;->DEFAULT_INSTANCE:LQ1/f;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/v;->B(Landroidx/datastore/preferences/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LQ1/f$a;

    invoke-direct {p1, p2}, LQ1/f$a;-><init>(LQ1/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, LQ1/f;

    invoke-direct {p1}, LQ1/f;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
