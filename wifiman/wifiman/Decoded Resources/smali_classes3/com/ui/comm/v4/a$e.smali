.class public final Lcom/ui/comm/v4/a$e;
.super Lcom/ui/comm/v4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/comm/v4/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/comm/v4/b;)V
    .locals 1

    const-string/jumbo v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/a$e;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/comm/v4/a$e;->d:Lcom/ui/comm/v4/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/comm/v4/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$e;->d:Lcom/ui/comm/v4/b;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$e;->c:Ljava/lang/String;

    return-object v0
.end method
