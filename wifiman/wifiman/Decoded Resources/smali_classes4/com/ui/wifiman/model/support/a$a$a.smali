.class public final Lcom/ui/wifiman/model/support/a$a$a;
.super Lcom/ui/wifiman/model/support/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/support/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lmd/a;


# direct methods
.method public constructor <init>(Lmd/a;)V
    .locals 1

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/support/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/a$a$a;->a:Lmd/a;

    return-void
.end method


# virtual methods
.method public final b()Lmd/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/support/a$a$a;->a:Lmd/a;

    return-object v0
.end method
