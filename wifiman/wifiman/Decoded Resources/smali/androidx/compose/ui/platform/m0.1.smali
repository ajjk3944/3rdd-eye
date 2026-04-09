.class public final Landroidx/compose/ui/platform/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/n1;


# instance fields
.field private final a:LR0/T;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR0/T;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/m0;->a:LR0/T;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/m0;->a:LR0/T;

    invoke-virtual {v0}, LR0/T;->c()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/m0;->a:LR0/T;

    invoke-virtual {v0}, LR0/T;->b()V

    return-void
.end method
