.class public final Landroidx/compose/ui/window/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/j;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/j;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/j;

    invoke-virtual {v0}, Landroidx/compose/ui/window/j;->k()V

    return-void
.end method
