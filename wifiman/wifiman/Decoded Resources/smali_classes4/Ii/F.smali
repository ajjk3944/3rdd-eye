.class public final synthetic LIi/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIi/F;->a:Lkotlin/jvm/internal/N;

    iput-boolean p2, p0, LIi/F;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LIi/F;->a:Lkotlin/jvm/internal/N;

    iget-boolean v1, p0, LIi/F;->b:Z

    check-cast p1, Ldh/i;

    check-cast p2, Ldh/i$b;

    invoke-static {v0, v1, p1, p2}, LIi/H;->a(Lkotlin/jvm/internal/N;ZLdh/i;Ldh/i$b;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
