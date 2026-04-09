.class final LAd/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAd/b;->d(J)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LAd/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAd/b$a;

    invoke-direct {v0}, LAd/b$a;-><init>()V

    sput-object v0, LAd/b$a;->a:LAd/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/r;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LAd/b$a;->a(Ll9/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
