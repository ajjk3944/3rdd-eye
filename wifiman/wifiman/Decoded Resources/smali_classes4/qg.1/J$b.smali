.class final Lqg/J$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lkg/f;


# direct methods
.method constructor <init>(Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/J$b;->a:Lkg/f;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lgg/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqg/J$b;->a:Lkg/f;

    invoke-interface {v0, p2}, Lkg/f;->accept(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lgg/h;

    invoke-virtual {p0, p1, p2}, Lqg/J$b;->a(Ljava/lang/Object;Lgg/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
