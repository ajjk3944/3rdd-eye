.class public abstract Lc0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lc0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lc0/l$a;->a:Lc0/l$a;

    sget-object v1, Lc0/l$b;->a:Lc0/l$b;

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, Lc0/l;->a:Lc0/k;

    return-void
.end method

.method public static final a(Lmh/p;Lmh/l;)Lc0/k;
    .locals 1

    new-instance v0, Lc0/l$c;

    invoke-direct {v0, p0, p1}, Lc0/l$c;-><init>(Lmh/p;Lmh/l;)V

    return-object v0
.end method

.method public static final b()Lc0/k;
    .locals 2

    sget-object v0, Lc0/l;->a:Lc0/k;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
