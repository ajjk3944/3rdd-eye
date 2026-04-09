.class Lcom/google/common/collect/i$c;
.super Lcom/google/common/collect/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/i;->l1()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/google/common/collect/i;


# direct methods
.method constructor <init>(Lcom/google/common/collect/i;)V
    .locals 1

    iput-object p1, p0, Lcom/google/common/collect/i$c;->e:Lcom/google/common/collect/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/i$e;-><init>(Lcom/google/common/collect/i;Lcom/google/common/collect/i$a;)V

    return-void
.end method


# virtual methods
.method c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/i$c;->e:Lcom/google/common/collect/i;

    invoke-static {v0, p1}, Lcom/google/common/collect/i;->t(Lcom/google/common/collect/i;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
