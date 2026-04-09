.class final Lod/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod/i;-><init>(LW7/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lod/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lod/i$b;

    invoke-direct {v0}, Lod/i$b;-><init>()V

    sput-object v0, Lod/i$b;->a:Lod/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lod/i;)Ljava/lang/Void;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod/i;

    invoke-virtual {p0, p1}, Lod/i$b;->a(Lod/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
