.class public final Lcom/ui/wifiman/model/support/c;
.super Lcom/ui/wifiman/model/support/a$a;
.source "SourceFile"


# instance fields
.field private final a:Lce/b;


# direct methods
.method public constructor <init>(Lce/b;)V
    .locals 1

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/support/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/c;->a:Lce/b;

    return-void
.end method


# virtual methods
.method public final b()Lce/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/support/c;->a:Lce/b;

    return-object v0
.end method
