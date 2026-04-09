.class public final Landroidx/compose/ui/platform/u1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/u1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/platform/u1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/u1$b;

    invoke-direct {v0}, Landroidx/compose/ui/platform/u1$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/u1$b;->b:Landroidx/compose/ui/platform/u1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/platform/a;)Lmh/a;
    .locals 3

    new-instance v0, Landroidx/compose/ui/platform/u1$b$b;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/u1$b$b;-><init>(Landroidx/compose/ui/platform/a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v1, Landroidx/compose/ui/platform/v1;

    invoke-direct {v1, p1}, Landroidx/compose/ui/platform/v1;-><init>(Landroidx/compose/ui/platform/a;)V

    invoke-static {p1, v1}, LK1/a;->a(Landroid/view/View;LK1/b;)V

    new-instance v2, Landroidx/compose/ui/platform/u1$b$a;

    invoke-direct {v2, p1, v0, v1}, Landroidx/compose/ui/platform/u1$b$a;-><init>(Landroidx/compose/ui/platform/a;Landroidx/compose/ui/platform/u1$b$b;LK1/b;)V

    return-object v2
.end method
