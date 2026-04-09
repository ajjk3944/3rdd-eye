.class public final Lcom/ui/comm/v4/a$g;
.super Lcom/ui/comm/v4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private final c:I

.field private final d:Ljava/util/Map;

.field private final e:Lcom/ui/comm/v4/b;


# direct methods
.method public constructor <init>(ILjava/util/Map;Lcom/ui/comm/v4/b;)V
    .locals 1

    const-string/jumbo v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ui/comm/v4/a$g;->c:I

    iput-object p2, p0, Lcom/ui/comm/v4/a$g;->d:Ljava/util/Map;

    iput-object p3, p0, Lcom/ui/comm/v4/a$g;->e:Lcom/ui/comm/v4/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/comm/v4/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$g;->e:Lcom/ui/comm/v4/b;

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/a$g;->d:Ljava/util/Map;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/ui/comm/v4/a$g;->c:I

    return v0
.end method
