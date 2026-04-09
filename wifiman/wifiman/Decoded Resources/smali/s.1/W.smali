.class public final Ls/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/V;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/W$a;
    }
.end annotation


# static fields
.field public static final b:Ls/W;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/W;

    invoke-direct {v0}, Ls/W;-><init>()V

    sput-object v0, Ls/W;->b:Ls/W;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Ls/W;->c:Z

    return v0
.end method

.method public bridge synthetic b(Landroid/view/View;ZJFFZLY0/d;F)Ls/U;
    .locals 0

    invoke-virtual/range {p0 .. p9}, Ls/W;->c(Landroid/view/View;ZJFFZLY0/d;F)Ls/W$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/View;ZJFFZLY0/d;F)Ls/W$a;
    .locals 0

    new-instance p2, Ls/W$a;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Ls/W$a;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method
