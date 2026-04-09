.class final Lcom/ui/wifiman/model/teleport/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$d;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/K;

.field final synthetic b:F


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;F)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$d$a;->a:Lkotlin/jvm/internal/K;

    iput p2, p0, Lcom/ui/wifiman/model/teleport/b$d$a;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$d$a;->a:Lkotlin/jvm/internal/K;

    iget v0, p1, Lkotlin/jvm/internal/K;->a:F

    iget v1, p0, Lcom/ui/wifiman/model/teleport/b$d$a;->b:F

    add-float/2addr v0, v1

    iput v0, p1, Lkotlin/jvm/internal/K;->a:F

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$d$a;->a(Ljava/lang/Long;)V

    return-void
.end method
