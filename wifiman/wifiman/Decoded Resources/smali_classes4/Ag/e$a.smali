.class final LAg/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LAg/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAg/e$a;

    invoke-direct {v0}, LAg/e$a;-><init>()V

    sput-object v0, LAg/e$a;->a:LAg/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;
    .locals 1

    new-instance v0, LYg/s;

    invoke-direct {v0, p1, p2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LAg/e$a;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method
