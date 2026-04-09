.class public abstract Lz7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/l;

.field private static final b:Lmh/l;

.field private static final c:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz7/l$b;->a:Lz7/l$b;

    sput-object v0, Lz7/l;->a:Lmh/l;

    sget-object v0, Lz7/l$c;->a:Lz7/l$c;

    sput-object v0, Lz7/l;->b:Lmh/l;

    sget-object v0, Lz7/l$a;->a:Lz7/l$a;

    sput-object v0, Lz7/l;->c:Lmh/a;

    return-void
.end method

.method public static final synthetic a()Lmh/a;
    .locals 1

    sget-object v0, Lz7/l;->c:Lmh/a;

    return-object v0
.end method

.method public static final synthetic b()Lmh/l;
    .locals 1

    sget-object v0, Lz7/l;->a:Lmh/l;

    return-object v0
.end method

.method public static final synthetic c()Lmh/l;
    .locals 1

    sget-object v0, Lz7/l;->b:Lmh/l;

    return-object v0
.end method
