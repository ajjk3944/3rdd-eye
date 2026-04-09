.class public abstract LSj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSj/a$c;,
        LSj/a$a;,
        LSj/a$b;
    }
.end annotation


# static fields
.field public static final a:LSj/a$b;

.field private static final b:Ljava/util/ArrayList;

.field private static volatile c:[LSj/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSj/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSj/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSj/a;->a:LSj/a$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LSj/a;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    new-array v0, v0, [LSj/a$c;

    sput-object v0, LSj/a;->c:[LSj/a$c;

    return-void
.end method

.method public static final synthetic a()[LSj/a$c;
    .locals 1

    sget-object v0, LSj/a;->c:[LSj/a$c;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, LSj/a;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final synthetic c([LSj/a$c;)V
    .locals 0

    sput-object p0, LSj/a;->c:[LSj/a$c;

    return-void
.end method
