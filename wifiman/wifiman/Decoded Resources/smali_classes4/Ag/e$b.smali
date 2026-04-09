.class final LAg/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAg/e;->b(Lgg/D;Lgg/D;Lgg/D;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LAg/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAg/e$b;

    invoke-direct {v0}, LAg/e$b;-><init>()V

    sput-object v0, LAg/e$b;->a:LAg/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LAg/e$b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYg/y;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYg/y;
    .locals 1

    new-instance v0, LYg/y;

    invoke-direct {v0, p1, p2, p3}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
