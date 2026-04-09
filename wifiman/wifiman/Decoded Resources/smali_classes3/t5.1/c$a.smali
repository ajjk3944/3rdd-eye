.class Lt5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/c;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lt5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0
.end method
