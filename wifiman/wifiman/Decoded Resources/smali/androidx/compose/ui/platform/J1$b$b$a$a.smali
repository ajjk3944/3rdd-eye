.class final Landroidx/compose/ui/platform/J1$b$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1$b$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/G0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/G0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$b$b$a$a;->a:Landroidx/compose/ui/platform/G0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$b$b$a$a;->b(FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(FLdh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Landroidx/compose/ui/platform/J1$b$b$a$a;->a:Landroidx/compose/ui/platform/G0;

    invoke-virtual {p2, p1}, Landroidx/compose/ui/platform/G0;->b(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
