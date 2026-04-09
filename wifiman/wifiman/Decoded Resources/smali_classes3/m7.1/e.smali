.class public abstract Lm7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7/e$a;
    }
.end annotation


# static fields
.field public static final a:Lm7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm7/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm7/e;->a:Lm7/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(F)F
.end method

.method public abstract b(Landroid/graphics/PointF;)Landroid/graphics/PointF;
.end method

.method public abstract c()[F
.end method

.method public abstract d()[F
.end method

.method public abstract e()[F
.end method

.method public abstract f()F
.end method

.method public abstract g()F
.end method

.method public abstract h()F
.end method
