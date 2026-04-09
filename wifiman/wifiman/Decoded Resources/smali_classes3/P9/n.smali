.class public final LP9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP9/n;

.field private static b:Li9/a;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:LAb/h;

.field private static f:LP9/j;

.field private static g:J

.field private static h:Z

.field private static i:Z

.field public static final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP9/n;

    invoke-direct {v0}, LP9/n;-><init>()V

    sput-object v0, LP9/n;->a:LP9/n;

    const-string/jumbo v0, "not_set"

    sput-object v0, LP9/n;->c:Ljava/lang/String;

    sput-object v0, LP9/n;->d:Ljava/lang/String;

    sget-object v0, LAb/h;->PRODUCTION:LAb/h;

    sput-object v0, LP9/n;->e:LAb/h;

    const-wide/16 v0, 0x1f4

    sput-wide v0, LP9/n;->g:J

    const/4 v0, 0x1

    sput-boolean v0, LP9/n;->i:Z

    const/16 v0, 0x8

    sput v0, LP9/n;->j:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    sget-object v0, LP9/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    sget-object v0, LP9/n;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Li9/a;
    .locals 1

    sget-object v0, LP9/n;->b:Li9/a;

    return-object v0
.end method

.method public final d()J
    .locals 2

    sget-wide v0, LP9/n;->g:J

    return-wide v0
.end method

.method public final e()LAb/h;
    .locals 1

    sget-object v0, LP9/n;->e:LAb/h;

    return-object v0
.end method

.method public final f()LP9/j;
    .locals 1

    sget-object v0, LP9/n;->f:LP9/j;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    sget-boolean v0, LP9/n;->i:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    sget-boolean v0, LP9/n;->h:Z

    return v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LP9/n;->c:Ljava/lang/String;

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LP9/n;->d:Ljava/lang/String;

    return-void
.end method

.method public final k(LAb/h;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LP9/n;->e:LAb/h;

    return-void
.end method

.method public final l(LP9/j;)V
    .locals 0

    sput-object p1, LP9/n;->f:LP9/j;

    return-void
.end method
