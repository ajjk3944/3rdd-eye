.class public abstract LN/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW0/h;

.field private static final b:LL0/U;

.field private static final c:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    new-instance v0, LW0/h;

    move-object/from16 v26, v0

    sget-object v1, LW0/h$a;->a:LW0/h$a$a;

    invoke-virtual {v1}, LW0/h$a$a;->a()F

    move-result v1

    sget-object v2, LW0/h$c;->a:LW0/h$c$a;

    invoke-virtual {v2}, LW0/h$c$a;->b()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LW0/h;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/d1;->a:LW0/h;

    sget-object v0, LL0/U;->d:LL0/U$a;

    invoke-virtual {v0}, LL0/U$a;->a()LL0/U;

    move-result-object v0

    invoke-static {}, LN/z;->a()LL0/B;

    move-result-object v25

    const v30, 0xe7ffff

    const/16 v31, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v0 .. v31}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v0

    sput-object v0, LN/d1;->b:LL0/U;

    sget-object v0, LN/d1$a;->a:LN/d1$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LN/d1;->c:LT/H0;

    return-void
.end method

.method public static final synthetic a(LL0/U;LQ0/k;)LL0/U;
    .locals 0

    invoke-static {p0, p1}, LN/d1;->d(LL0/U;LQ0/k;)LL0/U;

    move-result-object p0

    return-object p0
.end method

.method public static final b()LL0/U;
    .locals 1

    sget-object v0, LN/d1;->b:LL0/U;

    return-object v0
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, LN/d1;->c:LT/H0;

    return-object v0
.end method

.method private static final d(LL0/U;LQ0/k;)LL0/U;
    .locals 33

    invoke-virtual/range {p0 .. p0}, LL0/U;->j()LQ0/k;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    goto :goto_0

    :cond_0
    const v31, 0xffffdf

    const/16 v32, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v1, p0

    move-object/from16 v9, p1

    invoke-static/range {v1 .. v32}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v0

    :goto_0
    return-object v0
.end method
