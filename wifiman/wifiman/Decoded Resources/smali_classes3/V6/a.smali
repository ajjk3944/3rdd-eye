.class public final LV6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV6/a;

.field public static b:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV6/a;

    invoke-direct {v0}, LV6/a;-><init>()V

    sput-object v0, LV6/a;->a:LV6/a;

    const/4 v0, 0x0

    sget-object v1, LV6/a$a;->a:LV6/a$a;

    const v2, 0x560b94fd

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LV6/a;->b:Lmh/q;

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

    sget-object v0, LV6/a;->b:Lmh/q;

    return-object v0
.end method
