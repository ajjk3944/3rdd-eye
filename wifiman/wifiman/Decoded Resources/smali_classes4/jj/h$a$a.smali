.class final Ljj/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljj/g;


# direct methods
.method constructor <init>(Ljj/g;)V
    .locals 0

    iput-object p1, p0, Ljj/h$a$a;->a:Ljj/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ljj/h$a$a;->b(Ljava/util/List;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Ljj/h$a$a;->a:Ljj/g;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2}, Ljj/i;->J(II)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
