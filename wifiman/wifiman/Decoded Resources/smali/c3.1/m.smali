.class public abstract Lc3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lc5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lc5/h;->a()Lc5/h$a;

    move-result-object v0

    sget-object v1, Lc3/a;->a:La5/a;

    invoke-virtual {v0, v1}, Lc5/h$a;->d(La5/a;)Lc5/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lc5/h$a;->c()Lc5/h;

    move-result-object v0

    sput-object v0, Lc3/m;->a:Lc5/h;

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lc3/m;->a:Lc5/h;

    invoke-virtual {v0, p0}, Lc5/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method
