.class final synthetic Ldf/h$a$b$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/h$a$b;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onIspContactClicked(Lcom/ui/wifiman/ui/speed/isp/IspDetail$IspContactType;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Ldf/c;

    const-string v4, "onIspContactClicked"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ldf/b;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Ldf/c;

    invoke-virtual {v0, p1}, Ldf/c;->r0(Ldf/b;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldf/b;

    invoke-virtual {p0, p1}, Ldf/h$a$b$a;->a(Ldf/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
