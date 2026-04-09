.class final LE8/A$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A$k;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/A$k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/A$k$a;

    invoke-direct {v0}, LE8/A$k$a;-><init>()V

    sput-object v0, LE8/A$k$a;->a:LE8/A$k$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDd/a;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDd/a;->d()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDd/a;

    invoke-virtual {p0, p1}, LE8/A$k$a;->a(LDd/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
