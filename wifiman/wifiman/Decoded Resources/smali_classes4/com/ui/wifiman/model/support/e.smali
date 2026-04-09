.class public final Lcom/ui/wifiman/model/support/e;
.super Lcom/ui/wifiman/model/support/a$a;
.source "SourceFile"


# instance fields
.field private final a:Lbe/c$b;


# direct methods
.method public constructor <init>(Lbe/c$b;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/support/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/e;->a:Lbe/c$b;

    return-void
.end method


# virtual methods
.method public final b()Lbe/c$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/support/e;->a:Lbe/c$b;

    return-object v0
.end method
