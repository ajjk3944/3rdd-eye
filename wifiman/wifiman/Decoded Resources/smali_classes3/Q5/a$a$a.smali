.class final LQ5/a$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ5/a$a;-><init>(Lm0/i1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LQ5/a$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ5/a$a$a;

    invoke-direct {v0}, LQ5/a$a$a;-><init>()V

    sput-object v0, LQ5/a$a$a;->a:LQ5/a$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Matrix;
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ5/a$a$a;->a()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method
