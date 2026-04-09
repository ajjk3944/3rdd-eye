.class public abstract LC0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LC0/m;

.field private static final b:LC0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC0/m;

    sget-object v1, LC0/b$a;->a:LC0/b$a;

    invoke-direct {v0, v1}, LC0/m;-><init>(Lmh/p;)V

    sput-object v0, LC0/b;->a:LC0/m;

    new-instance v0, LC0/m;

    sget-object v1, LC0/b$b;->a:LC0/b$b;

    invoke-direct {v0, v1}, LC0/m;-><init>(Lmh/p;)V

    sput-object v0, LC0/b;->b:LC0/m;

    return-void
.end method

.method public static final a()LC0/m;
    .locals 1

    sget-object v0, LC0/b;->a:LC0/m;

    return-object v0
.end method

.method public static final b()LC0/m;
    .locals 1

    sget-object v0, LC0/b;->b:LC0/m;

    return-object v0
.end method

.method public static final c(LC0/a;II)I
    .locals 0

    invoke-virtual {p0}, LC0/a;->a()Lmh/p;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
