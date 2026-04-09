.class abstract LY6/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY6/t$m;,
        LY6/t$l;
    }
.end annotation


# static fields
.field public static final a:LY6/h$d;

.field static final b:LY6/h;

.field static final c:LY6/h;

.field static final d:LY6/h;

.field static final e:LY6/h;

.field static final f:LY6/h;

.field static final g:LY6/h;

.field static final h:LY6/h;

.field static final i:LY6/h;

.field static final j:LY6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY6/t$c;

    invoke-direct {v0}, LY6/t$c;-><init>()V

    sput-object v0, LY6/t;->a:LY6/h$d;

    new-instance v0, LY6/t$d;

    invoke-direct {v0}, LY6/t$d;-><init>()V

    sput-object v0, LY6/t;->b:LY6/h;

    new-instance v0, LY6/t$e;

    invoke-direct {v0}, LY6/t$e;-><init>()V

    sput-object v0, LY6/t;->c:LY6/h;

    new-instance v0, LY6/t$f;

    invoke-direct {v0}, LY6/t$f;-><init>()V

    sput-object v0, LY6/t;->d:LY6/h;

    new-instance v0, LY6/t$g;

    invoke-direct {v0}, LY6/t$g;-><init>()V

    sput-object v0, LY6/t;->e:LY6/h;

    new-instance v0, LY6/t$h;

    invoke-direct {v0}, LY6/t$h;-><init>()V

    sput-object v0, LY6/t;->f:LY6/h;

    new-instance v0, LY6/t$i;

    invoke-direct {v0}, LY6/t$i;-><init>()V

    sput-object v0, LY6/t;->g:LY6/h;

    new-instance v0, LY6/t$j;

    invoke-direct {v0}, LY6/t$j;-><init>()V

    sput-object v0, LY6/t;->h:LY6/h;

    new-instance v0, LY6/t$k;

    invoke-direct {v0}, LY6/t$k;-><init>()V

    sput-object v0, LY6/t;->i:LY6/h;

    new-instance v0, LY6/t$a;

    invoke-direct {v0}, LY6/t$a;-><init>()V

    sput-object v0, LY6/t;->j:LY6/h;

    return-void
.end method

.method static a(LY6/k;Ljava/lang/String;II)I
    .locals 1

    invoke-virtual {p0}, LY6/k;->J()I

    move-result v0

    if-lt v0, p2, :cond_0

    if-gt v0, p3, :cond_0

    return v0

    :cond_0
    new-instance p2, Lcom/squareup/moshi/JsonDataException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p3, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "Expected %s but was %s at path %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
