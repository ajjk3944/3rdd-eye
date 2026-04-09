.class final Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b(LA8/z;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lod/a;)Ljava/lang/Long;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$h;->a(Lod/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
