.class final Lcom/ui/wifiman/model/teleport/b$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$d$b;->a:Lkotlin/jvm/internal/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Ljava/lang/Float;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$d$b;->a:Lkotlin/jvm/internal/K;

    iget p1, p1, Lkotlin/jvm/internal/K;->a:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$d$b;->a(Ljava/lang/Long;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
