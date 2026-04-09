.class public abstract LM4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    sget-object v1, LM4/a;->a:La5/a;

    invoke-virtual {v0, v1}, Lb5/d;->j(La5/a;)Lb5/d;

    move-result-object v0

    invoke-virtual {v0}, Lb5/d;->i()LZ4/a;

    move-result-object v0

    sput-object v0, LM4/j;->a:LZ4/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;)LM4/j;
    .locals 7

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string/jumbo p0, "rolloutId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo p0, "parameterKey"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo p0, "parameterValue"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo p0, "variantId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string/jumbo p0, "templateVersion"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static/range {v1 .. v6}, LM4/j;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)LM4/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)LM4/j;
    .locals 7

    invoke-static {p2}, LM4/j;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance p2, LM4/b;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, LM4/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object p2
.end method

.method private static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()J
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public h()LN4/F$e$d$e;
    .locals 3

    invoke-static {}, LN4/F$e$d$e;->a()LN4/F$e$d$e$a;

    move-result-object v0

    invoke-static {}, LN4/F$e$d$e$b;->a()LN4/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, LM4/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/F$e$d$e$b$a;->c(Ljava/lang/String;)LN4/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, LM4/j;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/F$e$d$e$b$a;->b(Ljava/lang/String;)LN4/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {v1}, LN4/F$e$d$e$b$a;->a()LN4/F$e$d$e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$e$a;->d(LN4/F$e$d$e$b;)LN4/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, LM4/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$e$a;->b(Ljava/lang/String;)LN4/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, LM4/j;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$e$a;->c(Ljava/lang/String;)LN4/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, LM4/j;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LN4/F$e$d$e$a;->e(J)LN4/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$d$e$a;->a()LN4/F$e$d$e;

    move-result-object v0

    return-object v0
.end method
