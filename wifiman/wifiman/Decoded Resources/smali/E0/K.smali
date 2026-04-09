.class public abstract LE0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LY0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, LY0/f;->b(FFILjava/lang/Object;)LY0/d;

    move-result-object v0

    sput-object v0, LE0/K;->a:LY0/d;

    return-void
.end method

.method public static final synthetic a()LY0/d;
    .locals 1

    sget-object v0, LE0/K;->a:LY0/d;

    return-object v0
.end method

.method public static final b(LE0/G;)LE0/m0;
    .locals 0

    invoke-virtual {p0}, LE0/G;->n0()LE0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "LayoutNode should be attached to an owner"

    invoke-static {p0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method
