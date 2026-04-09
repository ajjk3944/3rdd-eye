.class public final LQ1/h;
.super Landroidx/datastore/preferences/protobuf/v;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ1/h$a;,
        LQ1/h$b;
    }
.end annotation


# static fields
.field public static final BOOLEAN_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:LQ1/h;

.field public static final DOUBLE_FIELD_NUMBER:I = 0x7

.field public static final FLOAT_FIELD_NUMBER:I = 0x2

.field public static final INTEGER_FIELD_NUMBER:I = 0x3

.field public static final LONG_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/V; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/V;"
        }
    .end annotation
.end field

.field public static final STRING_FIELD_NUMBER:I = 0x5

.field public static final STRING_SET_FIELD_NUMBER:I = 0x6


# instance fields
.field private bitField0_:I

.field private valueCase_:I

.field private value_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ1/h;

    invoke-direct {v0}, LQ1/h;-><init>()V

    sput-object v0, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    const-class v1, LQ1/h;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/v;->E(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/v;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/v;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LQ1/h;->valueCase_:I

    return-void
.end method

.method static synthetic G(LQ1/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LQ1/h;->d0(J)V

    return-void
.end method

.method static synthetic H(LQ1/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LQ1/h;->e0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I(LQ1/h;LQ1/g$a;)V
    .locals 0

    invoke-direct {p0, p1}, LQ1/h;->f0(LQ1/g$a;)V

    return-void
.end method

.method static synthetic K(LQ1/h;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, LQ1/h;->a0(D)V

    return-void
.end method

.method static synthetic L()LQ1/h;
    .locals 1

    sget-object v0, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    return-object v0
.end method

.method static synthetic M(LQ1/h;Z)V
    .locals 0

    invoke-direct {p0, p1}, LQ1/h;->Z(Z)V

    return-void
.end method

.method static synthetic N(LQ1/h;F)V
    .locals 0

    invoke-direct {p0, p1}, LQ1/h;->b0(F)V

    return-void
.end method

.method static synthetic O(LQ1/h;I)V
    .locals 0

    invoke-direct {p0, p1}, LQ1/h;->c0(I)V

    return-void
.end method

.method public static Q()LQ1/h;
    .locals 1

    sget-object v0, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    return-object v0
.end method

.method public static Y()LQ1/h$a;
    .locals 1

    sget-object v0, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->n()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    check-cast v0, LQ1/h$a;

    return-object v0
.end method

.method private Z(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LQ1/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private a0(D)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LQ1/h;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private b0(F)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LQ1/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private c0(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LQ1/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private d0(J)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LQ1/h;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private e0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, LQ1/h;->valueCase_:I

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method private f0(LQ1/g$a;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/v$a;->n()Landroidx/datastore/preferences/protobuf/v;

    move-result-object p1

    iput-object p1, p0, LQ1/h;->value_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, LQ1/h;->valueCase_:I

    return-void
.end method


# virtual methods
.method public P()Z
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public R()D
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public S()F
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public T()I
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public U()J
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public V()Ljava/lang/String;
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public W()LQ1/g;
    .locals 2

    iget v0, p0, LQ1/h;->valueCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LQ1/h;->value_:Ljava/lang/Object;

    check-cast v0, LQ1/g;

    return-object v0

    :cond_0
    invoke-static {}, LQ1/g;->L()LQ1/g;

    move-result-object v0

    return-object v0
.end method

.method public X()LQ1/h$b;
    .locals 1

    iget v0, p0, LQ1/h;->valueCase_:I

    invoke-static {v0}, LQ1/h$b;->forNumber(I)LQ1/h$b;

    move-result-object v0

    return-object v0
.end method

.method protected final q(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    sget-object p1, LQ1/h;->PARSER:Landroidx/datastore/preferences/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LQ1/h;

    monitor-enter p2

    :try_start_0
    sget-object p1, LQ1/h;->PARSER:Landroidx/datastore/preferences/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/v$b;

    sget-object p3, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/v$b;-><init>(Landroidx/datastore/preferences/protobuf/v;)V

    sput-object p1, LQ1/h;->PARSER:Landroidx/datastore/preferences/protobuf/V;

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
    sget-object p1, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    return-object p1

    :pswitch_4
    const-string p1, "value_"

    const-string p2, "valueCase_"

    const-string p3, "bitField0_"

    const-class v0, LQ1/g;

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000"

    sget-object p3, LQ1/h;->DEFAULT_INSTANCE:LQ1/h;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/v;->B(Landroidx/datastore/preferences/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LQ1/h$a;

    invoke-direct {p1, p2}, LQ1/h$a;-><init>(LQ1/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, LQ1/h;

    invoke-direct {p1}, LQ1/h;-><init>()V

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
