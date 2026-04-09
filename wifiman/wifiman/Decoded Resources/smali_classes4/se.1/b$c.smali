.class final Lse/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse/b;-><init>(LWd/f;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lse/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lse/b$c;

    invoke-direct {v0}, Lse/b$c;-><init>()V

    sput-object v0, Lse/b$c;->a:Lse/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;

    if-eqz v0, :cond_0

    const-string p1, "Failed to fetch latest available firmwares"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lse/b$c;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
