.class public final Llf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Llf/a;

.field public static b:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llf/a;

    invoke-direct {v0}, Llf/a;-><init>()V

    sput-object v0, Llf/a;->a:Llf/a;

    const/4 v0, 0x0

    sget-object v1, Llf/a$a;->a:Llf/a$a;

    const v2, 0x383a4c14

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Llf/a;->b:Lmh/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    sget-object v0, Llf/a;->b:Lmh/q;

    return-object v0
.end method
