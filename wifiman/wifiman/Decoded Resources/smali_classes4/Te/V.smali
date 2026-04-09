.class public final LTe/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTe/V$a;,
        LTe/V$b;
    }
.end annotation


# static fields
.field public static final a:LTe/V;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTe/V;

    invoke-direct {v0}, LTe/V;-><init>()V

    sput-object v0, LTe/V;->a:LTe/V;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJLT/l;I)LTe/V$a;
    .locals 18

    move-object/from16 v0, p5

    move/from16 v1, p6

    const v2, 0x58c610c0

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.signal.components.SignalChartMarker.rememberSignalMapperChartMarkerComponents (SignalChartMarker.kt:62)"

    invoke-static {v2, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v2, 0x43ea6967

    invoke-interface {v0, v2}, LT/l;->U(I)V

    and-int/lit8 v2, v1, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x4

    move-wide/from16 v7, p1

    if-le v2, v5, :cond_1

    invoke-interface {v0, v7, v8}, LT/l;->j(J)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 v2, v1, 0x6

    if-ne v2, v5, :cond_3

    :cond_2
    move v2, v4

    goto :goto_0

    :cond_3
    move v2, v3

    :goto_0
    and-int/lit8 v5, v1, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    move-wide/from16 v9, p3

    if-le v5, v6, :cond_4

    invoke-interface {v0, v9, v10}, LT/l;->j(J)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v6, :cond_6

    :cond_5
    move v3, v4

    :cond_6
    or-int v1, v2, v3

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    :cond_7
    new-instance v2, LTe/V$a;

    const/16 v16, 0x7c

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v2

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    invoke-direct/range {v6 .. v17}, LTe/V$a;-><init>(JJLo6/d;Lo6/d;Lo6/d;Lo6/d;Lt6/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, LTe/V$a;

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    return-object v2
.end method
