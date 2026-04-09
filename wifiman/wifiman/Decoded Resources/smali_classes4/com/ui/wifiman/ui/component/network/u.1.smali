.class public final synthetic Lcom/ui/wifiman/ui/component/network/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:F

.field public final synthetic c:Lm0/V0;


# direct methods
.method public synthetic constructor <init>(JFLm0/V0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/ui/wifiman/ui/component/network/u;->a:J

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/u;->b:F

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/u;->c:Lm0/V0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lcom/ui/wifiman/ui/component/network/u;->a:J

    iget v2, p0, Lcom/ui/wifiman/ui/component/network/u;->b:F

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/u;->c:Lm0/V0;

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/ui/wifiman/ui/component/network/B;->g(JFLm0/V0;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
