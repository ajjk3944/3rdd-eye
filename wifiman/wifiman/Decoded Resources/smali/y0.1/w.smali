.class public abstract Ly0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ly0/t;

.field private static final b:Ly0/t;

.field private static final c:Ly0/t;

.field private static final d:Ly0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly0/a;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ly0/a;-><init>(I)V

    sput-object v0, Ly0/w;->a:Ly0/t;

    new-instance v0, Ly0/a;

    const/16 v1, 0x3ef

    invoke-direct {v0, v1}, Ly0/a;-><init>(I)V

    sput-object v0, Ly0/w;->b:Ly0/t;

    new-instance v0, Ly0/a;

    const/16 v1, 0x3f0

    invoke-direct {v0, v1}, Ly0/a;-><init>(I)V

    sput-object v0, Ly0/w;->c:Ly0/t;

    new-instance v0, Ly0/a;

    const/16 v1, 0x3ea

    invoke-direct {v0, v1}, Ly0/a;-><init>(I)V

    sput-object v0, Ly0/w;->d:Ly0/t;

    return-void
.end method

.method public static final a(I)Ly0/t;
    .locals 1

    new-instance v0, Ly0/a;

    invoke-direct {v0, p0}, Ly0/a;-><init>(I)V

    return-object v0
.end method

.method public static final b()Ly0/t;
    .locals 1

    sget-object v0, Ly0/w;->b:Ly0/t;

    return-object v0
.end method

.method public static final c()Ly0/t;
    .locals 1

    sget-object v0, Ly0/w;->a:Ly0/t;

    return-object v0
.end method

.method public static final d()Ly0/t;
    .locals 1

    sget-object v0, Ly0/w;->d:Ly0/t;

    return-object v0
.end method

.method public static final e()Ly0/t;
    .locals 1

    sget-object v0, Ly0/w;->c:Ly0/t;

    return-object v0
.end method
