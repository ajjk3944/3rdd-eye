.class public abstract LP6/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lgg/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP6/E$a;

    invoke-direct {v0}, LP6/E$a;-><init>()V

    sput-object v0, LP6/E;->a:Lgg/w;

    return-void
.end method

.method public static a()Lgg/w;
    .locals 1

    sget-object v0, LP6/E;->a:Lgg/w;

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Lgg/s;
    .locals 1

    invoke-static {}, Lgg/s;->n0()Lgg/s;

    move-result-object v0

    invoke-virtual {v0, p0}, Lgg/s;->I0(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    return-object p0
.end method
