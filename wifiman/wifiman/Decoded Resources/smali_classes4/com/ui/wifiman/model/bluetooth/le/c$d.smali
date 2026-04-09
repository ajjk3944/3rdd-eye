.class final Lcom/ui/wifiman/model/bluetooth/le/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/c;->a(Lh9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/c;

.field final synthetic b:Lh9/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$d;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/c$d;->b:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/c$d;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$d;->b:Lh9/a;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/c;->e(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$d;->a(Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p1

    return-object p1
.end method
