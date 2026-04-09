.class final synthetic LI/a$b$a$b;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/N0$a;


# direct methods
.method constructor <init>(LI/N0$a;)V
    .locals 6

    iput-object p1, p0, LI/a$b$a$b;->a:LI/N0$a;

    const-string v4, "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/s$a;

    const-string v3, "localToScreen"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a([F)V
    .locals 1

    iget-object v0, p0, LI/a$b$a$b;->a:LI/N0$a;

    invoke-static {v0, p1}, LI/a;->o(LI/N0$a;[F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/O0;

    invoke-virtual {p1}, Lm0/O0;->r()[F

    move-result-object p1

    invoke-virtual {p0, p1}, LI/a$b$a$b;->a([F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
