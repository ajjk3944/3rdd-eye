.class final Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b(LA8/z;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const-string/jumbo v2, "FloorplanControllerMgr - failed to store floorplan"

    invoke-static {v2, p1, v0, v1, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$j;->a(Ljava/lang/Throwable;)V

    return-void
.end method
