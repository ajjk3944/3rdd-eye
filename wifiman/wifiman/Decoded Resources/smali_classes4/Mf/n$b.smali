.class final LMf/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf/n;->b(LMf/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMf/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$b;

    invoke-direct {v0}, LMf/n$b;-><init>()V

    sput-object v0, LMf/n$b;->a:LMf/n$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LMf/a$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LMf/n$b;->c(LMf/a$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LMf/a$b;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, LMf/a$b;->a()F

    move-result v0

    const/16 v1, 0x64

    int-to-float v1, v1

    mul-float/2addr v0, v1

    instance-of v1, p0, LMf/a$b$b;

    if-eqz v1, :cond_0

    check-cast p0, LMf/a$b$b;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LMf/a$b$b;->c()J

    move-result-wide v1

    long-to-float v1, v1

    const v2, 0x49742400    # 1000000.0f

    div-float/2addr v1, v2

    invoke-virtual {p0}, LMf/a$b$b;->b()J

    move-result-wide v3

    long-to-float p0, v3

    div-float/2addr p0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    const-string p0, ""

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WMW FW Upgrade State - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, "% "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LMf/a$b;

    invoke-virtual {p0, p1}, LMf/n$b;->b(LMf/a$b;)V

    return-void
.end method

.method public final b(LMf/a$b;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMf/o;

    invoke-direct {v0, p1}, LMf/o;-><init>(LMf/a$b;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
