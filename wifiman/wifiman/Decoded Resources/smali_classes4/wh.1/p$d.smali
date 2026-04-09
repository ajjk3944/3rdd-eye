.class public final Lwh/p$d;
.super Lwh/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Lwh/n$e;

.field private final b:Lwh/n$e;


# direct methods
.method public constructor <init>(Lwh/n$e;Lwh/n$e;)V
    .locals 1

    const-string v0, "getterSignature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwh/p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lwh/p$d;->a:Lwh/n$e;

    iput-object p2, p0, Lwh/p$d;->b:Lwh/n$e;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/p$d;->a:Lwh/n$e;

    invoke-virtual {v0}, Lwh/n$e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lwh/n$e;
    .locals 1

    iget-object v0, p0, Lwh/p$d;->a:Lwh/n$e;

    return-object v0
.end method

.method public final c()Lwh/n$e;
    .locals 1

    iget-object v0, p0, Lwh/p$d;->b:Lwh/n$e;

    return-object v0
.end method
