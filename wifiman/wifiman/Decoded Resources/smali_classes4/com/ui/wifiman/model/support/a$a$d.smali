.class public final Lcom/ui/wifiman/model/support/a$a$d;
.super Lcom/ui/wifiman/model/support/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/support/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:LZc/e;


# direct methods
.method public constructor <init>(LZc/e;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/support/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/a$a$d;->a:LZc/e;

    return-void
.end method


# virtual methods
.method public final b()LZc/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/support/a$a$d;->a:LZc/e;

    return-object v0
.end method
