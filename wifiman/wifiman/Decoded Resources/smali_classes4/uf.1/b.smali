.class public final Luf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luf/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luf/b;

    invoke-direct {v0}, Luf/b;-><init>()V

    sput-object v0, Luf/b;->a:Luf/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILT/l;I)LL0/d;
    .locals 34

    move-object/from16 v0, p3

    move/from16 v1, p4

    const-string v2, "ip"

    move-object/from16 v9, p1

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x55ee0c8d

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    const/4 v10, -0x1

    if-eqz v3, :cond_0

    const-string v3, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.getTextWithIPHighlighted (DirectConsoleConnectionPopupUi.kt:46)"

    invoke-static {v2, v1, v10, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v2, LL0/d$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v2, v3, v5, v4}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    move/from16 v3, p2

    invoke-static {v3, v0, v1}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "format(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v3 .. v8}, Lkotlin/text/t;->k0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    const v3, 0xed01621

    invoke-interface {v0, v3}, LT/l;->U(I)V

    if-eq v1, v10, :cond_1

    new-instance v3, LL0/D;

    move-object v11, v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v0, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->a()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->a()LL0/U;

    move-result-object v4

    invoke-virtual {v4}, LL0/U;->o()LQ0/A;

    move-result-object v16

    const v32, 0xfffb

    const/16 v33, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v11 .. v33}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, v3, v1, v4}, LL0/d$a;->c(LL0/D;II)V

    :cond_1
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-virtual {v2}, LL0/d$a;->p()LL0/d;

    move-result-object v1

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-object v1
.end method
