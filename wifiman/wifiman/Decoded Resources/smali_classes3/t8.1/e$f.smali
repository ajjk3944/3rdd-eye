.class final Lt8/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt8/e;->J0(LOe/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lt8/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt8/e$f;

    invoke-direct {v0}, Lt8/e$f;-><init>()V

    sput-object v0, Lt8/e$f;->a:Lt8/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lt8/e$f;->a(Ljava/util/Set;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
