.class public abstract Lli/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZh/c;

.field public static final b:LZh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LZh/c;

    const-string v1, "kotlin.suspend"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lli/Q;->a:LZh/c;

    new-instance v0, LZh/a;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    const-string v2, "suspend"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    const-string v3, "identifier(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, LZh/a;-><init>(LZh/c;LZh/f;)V

    sput-object v0, Lli/Q;->b:LZh/a;

    return-void
.end method
